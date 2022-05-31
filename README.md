# SaRcAsM tExT by *Chris Penno*

### Brief:

I wanted a simple project to test the waters of Git usage and application packaging. This java application takes a String either from the terminal as an arg or taken from the OS' clipboard and manipulates it to capitalise every even character and decapitalise every odd character. This was inspired by the coloquial internet method of portraying sarcasm in plain text using this method. 

*"Plain text"* becomes *"PlAiN TeXt"*

This is a very simple project with little code and dependencies, however, I used it to test JAR file creation and making code executable as a windows .exe file. Using [Launch4j](http://launch4j.sourceforge.net/), I wrapped the .jar file into a windows executable. Then using [Logitech G Hub](https://www.logitechg.com/en-nz/innovation/g-hub.html) for my Logitech G402 mouse, I was able to assign this executable to a mouse button. This allowed me to highlight text on any program, copy it, press a mouse button, then paste the text anywhere else completely updated.

There are currently, two branches for this repo, master and Standalone-Console. Originally, this program ran as a console executed application, requiring the String to be altered to be used as a arguement for the Java file. This is saved in situ under the Standalone-Console branch. The master branch was then further updated to involve the clipboard, updated with an executable final state in mind. 

### State: 

This project is finished.
