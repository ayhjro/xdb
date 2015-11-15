# Introduction #

iSCISI installation for DHBW cluster

# Details #

For connecting the volume to one node--
  * 1- type in "sudo yast"
  * 2- In "Network services", choose the last one "iSCSI initiator"
  * 3- wait for some initialization
  * 4- go to the third tab, "Discovered targets"
  * 5- There you can see 10 iSCSI storage volumes. Choose one, and then go to "Log in", and then in the new window, click Next
  * 6- Exit

After connecting, you should  mount the volume to somewhere in you blade machine --
  * 1- You can list the connected iscsi devices by typing "lsscsi", which gives you the storage address (in the form of /dev/sdc)
  * 2- Then you can mount it by "sudo mount /dev/sdc /your/desired/location"
one nice place to mount them is /media/iscsi1 that I have already created the folders for