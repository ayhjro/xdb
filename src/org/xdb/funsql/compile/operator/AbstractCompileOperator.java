package org.xdb.funsql.compile.operator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.xdb.error.Error;
import org.xdb.utils.Identifier;
import org.xdb.utils.SetUtils;

import com.oy.shared.lm.graph.Graph;
import com.oy.shared.lm.graph.GraphNode;


public abstract class AbstractCompileOperator implements Serializable {

	private static final long serialVersionUID = -5531022011681321483L;

	//attributes
	protected Vector<ResultDesc> results;
	protected EnumOperator type;
	protected Vector<AbstractCompileOperator> children = new Vector<AbstractCompileOperator>();
	protected Vector<AbstractCompileOperator> parents = new Vector<AbstractCompileOperator>();
	
	// unique operator id
	protected Identifier operatorId;
	
	//constructors
	public AbstractCompileOperator(){
		this.children = new Vector<AbstractCompileOperator>();
		this.parents = new Vector<AbstractCompileOperator>();
	}
	
	public AbstractCompileOperator(AbstractCompileOperator toCopy){
		this.children = toCopy.children;
		this.parents = toCopy.parents;
		this.type = toCopy.type;
		this.results = toCopy.results;
	}

	public AbstractCompileOperator(int resultNumber){
		this.results = new Vector<ResultDesc>(resultNumber);
	}
	
	//getters and setters
	/**
	 * Get all source operators.
	 * @return set of all dependency operators, empty set if no given
	 */
	public Vector<AbstractCompileOperator> getChildren(){
		return this.children;
	}

	/**
	 * Get all destination operators.
	 * @return set of all dependency operators, empty set if no given
	 */
	public Vector<AbstractCompileOperator> getParents(){
		return this.parents;
	}
	
	public Identifier getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Identifier operatorId) {
		this.operatorId = operatorId;
	}
	
	public ResultDesc getResult(int i) {
		return results.get(i);
	}

	public void setResult(int i, ResultDesc result) {
		this.results.set(i,  result);
	}
	
	public void addResult(ResultDesc result) {
		this.results.add(result);
	}

	public EnumOperator getType() {
		return type;
	}

	public void setType(EnumOperator type) {
		this.type = type;
	}
	
	public int getResultNumber(){
		return this.results.size();
	}
	
	public void setSourceOperators(Vector<AbstractCompileOperator> sources) {
		this.children = sources;
	}
	
	public void setDestinationOperators(Vector<AbstractCompileOperator> destinations) {
		this.parents = destinations;
	}
	
	public void addDestinationOperators(AbstractCompileOperator destination) {
		this.parents.add(destination);
	}
	
	// methods
	public int findParent(AbstractCompileOperator parent){
		for(int i=0; i<this.parents.size();++i){
			if(this.parents.get(i).equals(parent)){
				return i;
			}
		}
		return -1;
	}
	
	public boolean removeParent(AbstractCompileOperator parent){
		return this.parents.remove(parent);
	}
	
	public void addParents(Vector<AbstractCompileOperator> parents){
		this.parents.addAll(parents);
	}
	
	/**
	 * Get list of all result TokenAttributes.
	 */
	protected List<String> getResultTableAttributes() {
		return SetUtils.attributesToTableString(getResult(0).getAttributes());
	}
	protected List<String> getResultAttributes() {
		return SetUtils.attributesToString(getResult(0).getAttributes());
	}
	
	@Override
	public boolean equals(Object o){
		AbstractCompileOperator op  = (AbstractCompileOperator)o;
		if(op.operatorId.equals(this.operatorId))
			return true;
		
		return false;
	}
	
	@Override
	public String toString(){
		StringBuffer value = new StringBuffer();
		value.append("(");
		value.append(this.operatorId);
		value.append(":");
		value.append(this.type);
		value.append(")");
		return value.toString();
	}
	
	/**
	 * Generate SQL representation of this operator
	 * @return
	 */
	public abstract String toSqlString();
	
	/**
	 * Renames attributes names according to new id of child
	 * @param oldId
	 * @param newId
	 */
	public abstract void renameAttributes(String oldChildId, String newChildId);
	
	/**
	 * Checks if operator is leave
	 * @return
	 */
	public abstract boolean isLeaf();
	
	/**
	 * Generates a visual graph representation of the operator
	 * @param g
	 * @return
	 */
	public abstract Error traceGraph(Graph g, HashMap<Identifier, GraphNode> nodes);
}