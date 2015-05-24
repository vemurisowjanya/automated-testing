##Automated Testing

This Repository contains all the coding work regarding development of a Java based Test Framework that targets testing automation of Systers Portal.


##Steps for Setting Up the Testing Environment

* Intall the Virtual Box on your machine 

* Install the Vagrant Software

* Clone the DevEnvironment Repository using the git clone <link> command on the terminal

* Change directory to reach the systers-autotest folder inside the DevEnvironment. It will contain a Vagrantfile

* Run : *vagrant up*   This shall download the Ubuntu VM image and set it up for the first time. Next time onwards this command will be used to boot up the VM.

* Run: vagrant ssh
Username: vagrant
password: vagrant

* Within vagrant, Type the command to install ubuntu GUI (in Ubuntu the command will be: sudo apt-get install ubuntu-desktop)

* In another window, after that's done, run *vagrant halt*

* Open the Virtual box and connect to the Vagrant VM. The Setup is complete
