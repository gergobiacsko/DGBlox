## Welcome to DGBlox Mod!
Setup MCP was done mostly by the people who update How to Compile for Beginners on the wiki, I just updated/changed it a bit.  Some credit goes to BuildCraft's README.md, which I based this README off of.

The Minecraft Forums page can be found [here] (http://www.minecraftforum.net/topic/1585823-146-dylangores-mods/).

### Compiling DGBloxMod
IMPORTANT: This is not guaranteed to work as it has not been tested extensively (Linux and Windows tested).
____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
#### Prerequisites  (Tested for Windows ONLY!)
0. WARNING:  Make sure you know EXACTLY what you're doing!  It's not any of our faults if your OS crashes, becomes corrupted, etc.
1. Download and install the Java JDK [here] (http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html).  Scroll down, accept the Oracle Binary Code License Agreement for Java SE, and download the one pertaining to your OS.
	* Go to `Control Panel\System and Security\System`, and click on `Advanced System Settings` on the left-hand side.
	* Click on `Environment Variables`.
  * Under `System Variables`, click `New`.
  * For `Variable Name`, input `JAVA_HOME`.
  * For `Variable Value`, input something similar to `;C:\Program Files (x86)\Java\jdk1.7.0_10` exactly as shown to the end.(or wherever your Java JDK installation is), and click `Ok`.
  * Scroll down to a variable named `Path`, and double-click on it.
  * Append `;C:\Program Files (x86)\Java\jdk1.7.0_10\bin` (or wherever your Java JDK installation is \bin), and click `Ok`.
2. Download Apache Ant [here] (http://ant.apache.org).
	* Unzip the files anywhere you want, eg `C:\Program Files (x86)\Ant`.
  * Again, go to `Environment Variables` just like you did for the Java JDK.
  * Under `System Variables`, click `New`.
  * For `Variable Name`, input `ANT_HOME`.
  * For `Variable Value`, input `C:\Ant\apache-ant-1.8.4` (or your Ant directory \apache-ant-1.8.4).
  * Scroll down to `Path`, and double-click on it.
  * Append `;C:\Ant\apache-ant-1.8.4\bin` exactly as shown to the end (or your Ant directory \apache-ant-1.8.4\bin).
3. Download and install Github [here] (http://windows.github.com/) (Windows) or [here] (http://mac.github.com/) (Mac OS X 10.7+).  For Linux, I *guess* you could download it as a .zip/tarball and unzip it?
	* Create an account.
  * Scroll to the top of this page, login at the top-right, and then click `Clone to Windows/Mac` near the top-left of the page.
  * You should see Github flash and `DylanGore/DGBlox` appear.  (The local repository on Windows defaults to `C:\Users\(username)\Documents\GitHub\DGBlox`, you can change it if you want but then you have to find it again on Github).
4. Create an empty directory for DGBlox development.  This directory is refernced as `mcdev` from now on.  It can be where you cloned DGBlox but it'll be a little messy.
5. You are now ready to setup MCP!


#### Setup MCP (Tested on Linux and Windows)
1. Download the latest version of MCP from [here] (http://mcp.ocean-labs.de/index.php/MCP_Releases), e.g. mcp725.zip. Install MCP dependencies as listed on the website if neccessary.
2. Inside `mcdev`, create a directory named `mcp` and unzip the MCP .zip file into it.
	* To verify, check if a file named `CHANGELOG` exists inside `mcp`.
3. Download the latest forge **source** for Minecraft 1.4.6 and unzip it into `mcp`.  You need at least Forge 6.5.0.489, best way is to get it from [here] (http://files.minecraftforge.net/).
	* To verify, check if a application named `install.sh` exists. 
4. Execute `install.sh` (Linux and Mac) or `install.cmd` (Windows), both found in `mcdev\mcp\forge`. On Linux you might have to `chmod +x` `install.sh` before you can execute it. On some system configurations you need to execute `install.sh` from within the `forge` directory whereas on others it doesn't matter. Just check the output for error messages to find out what you need to do.

#### Setup DGBlox (Some tested for Linux, tested fully for Windows)
1. Inside `mcdev`, create a directory named `source`.
2. Move/clone `DGBlox` into `source`.
3. Right now, you should have a directory that looks something like:
***

	mcdev
	\-mcp
		\-complicated mcp stuff (should have CHANGELOG).
		\-forge
		\-jars
	\-source
		\-DGBlox
			\-DGBlox's files (should have build.xml).
***
4. Inside `DGBlox`, create a new file called `build.properties`.
	* Open it up, and type into it the following:
 		* `dir.development=../../`
		*	`dir.share=Shared` (or what you want it to be-optional)
		*	`dir.release=Releases` (what you want it to be)
		*	`release.minecraft.version=1.4.6` (as of 12/25)
		*	`release.mod.version=1.01` (or whatever version # want it to be)
5. [FOR WINDOWS] Open up `cmd` by typing `cmd` in Run.
6. [FOR WINDOWS] Navigate to `mcdev\source\DGBlox` by executing `cd mcdev's location\source\DGBlox`.
7. Execute `ant release`. This will generally take around 5-15 minutes, depending on your computer.  If you've done everything right, `BUILD SUCCESSFUL` is displayed after it finishes.
	* If you see `BUILD FAILED`, check the error output (it should be right around `BUILD FAILED`), fix everything, and try again.
8. Go to `mcdev\source\DGBlox\Releases\1.4.6\1.01` (This might be different according to what you put in build.properties).
	*  You should see a .jar named `DGBlox-universal-1.01.jar` (Again, might be different).
9. Copy the jar into your Minecraft mods folder, and play Minecraft!

#### Update DGBlox (For Windows/Mac)
1. Check to see if DylanGore updated DGBlox since you last compiled.  If he did, follow these instructions.
2. Open Github.
3. Double-click on DylanGore/DGBlox
4. At the top, there is a button named `Sync`/`Sync Branch` (Mac) (or `Refreshing...` if it's still checking).
5. Click `Sync`, and wait for it to finish.
6. Re-compile (or move it to `mcdev\source` then re-compile, depending on what you did.)

###Contributing
___________________________________________________________________________________________________________________________________________________
#### Submitting a PR
So you found a bug in DylanGore's code?  Think you can make it more efficient?  Want to help in general?  Great!

0. IMPORTANT:  DylanGore DOES **NOT** WANT ANY `build.xml` CHANGES, UNLESS it fixes up something broken.
1. If you haven't already, create a Github account.
2. Click `Fork` at the top-right of this page (below your username)
3. Make the changes that you want to.
4. Click `Pull Request` at the top-middle of the page (left of your fork's name, to the right of `Watch` and `Fork`).
5. Enter your PR's title, and create a detailed description telling DylanGore what you changed.
6. Click `Send pull request`, and you're done!

#### Creating an Issue
So, maybe you have no idea what Java is, but you **do** know that DGBlox crashes each time you enter a world.  Or, maybe you have an idea that you want DylanGore to implement.  No problem!  Just create an issue instead of submitting a PR.

1. Go to [the issues page] (http://github.com/DylanGore/DGBlox/issues).
2. Click `New Issue` right below `Graphs`.
3. Enter your Issue's title (like DGBlox crashes when placing White Stone), and then create a detailed description telling DylaGore what happened (like "When trying to place White Stone, DGBlox crashes.  Here's the error report: [link]).
4. Click `Submit new issue`, and you're done!
