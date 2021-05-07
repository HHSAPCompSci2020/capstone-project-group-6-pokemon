Pokemon Fighting
Authors: Isa Pudiyapura, Rishi Zamvar, Kelsey Shan
Revision: 5/6/21 [put last modified date here.]


Introduction: 


In the year 3000, a swarm of never before seen animal species breached the earth’s atmosphere through a tear in the time-space continuum. As more research was done on the peculiar creatures, we have discovered a way to befriend and adopt them. Before long, a new sport where pokemon-trainer duos could duel was created: Pokemon Fighting[a]. 


You have finally turned the ripe age of 10 and have begun to set out on the greatest adventure of your life. While many children applied to become a trainer, you are one of the chosen few who will learn to be a pokemon trainer because of your perseverance, mental disciple, and innate ability. With only a handful of starting pokemon, you set off to create an invincible team and become the greatest trainer of all time.


In this turn based multiplayer pokemon game, players take turns attacking their opponent and battling to determine a winner. Each battle you win will help level up your pokemon and make you stronger. In battle, you face off with one opponent and are allowed one pokemon out. Battles follow a tag-team style, and your choice of pokemon can be strategically switched out based on attributes or health. 


Instructions:
[Explain how to use the program. This needs to be specific: 
Which keyboard keys will do what? 
Where will you need to click? 
Will you have menus that need to be navigated? What will they look like? 
Do actions need to be taken in a certain order?]


1. The game opens up on a main menu with three buttons: Instructions, Single Computer, and Networked Play. Single Computer will allow two players to play on the same computer. Networked play will allow players to join rooms and play with people on other computers. Each networked room has a 2 person limit. The instructions button will open a list with the rules to play the game. 
2. When the players decide to play, they will be brought to a screen with a drop down containing all 5 possible pokemon. The player will use the mouse to select pokemon to join their team by clicking the buttons with the pokemon’s name.
3. After both players have choses a team, they will click the “Fight” button.
4. They will be taken to another screen with two empty platforms. 
5. A panel of the pokemon team selected by the players will appear. The player will choose the pokemon that they want to start fighting with. 
6. After selecting a pokemon, the players will also have access to a panel of buttons labeled with the attacks possible. There will also be a separate button labelled “swap” which switches the pokemon currently fighting with another team member.
7. The fight will alternate between players and allow them to select moves when it is their turn.
8. A player loses once the pokemon that is currently deployed loses all its HP.
9. Once someone loses, you are brought to the ending screen. The winner will be displayed on the screen. There will also be buttons to “fight again” and “restart”. “Fight again” will take the player back to the fighting screen with the platforms and they will be able to fight again. “Restart” will clear the current players’ levels and pokemon and send them back to the starting screen.
**Click on the ‘X’ button on the top right hand corner to exit the game. 


Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* Menu that includes instructions and how to play the game
* Players can win or lose battles by defeating(die/kill) an opponent's pokemon
* Two players can play on the same computer
* 5 pokemon with different attake values, HP, and attributes. There will be different attack values low, middle, high. HP and other attributes will have a starting value which increases as the pokemon levels up.[b] When a pokemon defeats another, it increases a scaling factor that will be used as a multiplier for the HP and attack attributes.
* Simple 2-Dimensional graphics[c]. The pokemon will be image icons and the background set up will be composed of basic shapes


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* A Xbox controller input in addition to keyboard input
* A customizable 3 pokemon team that allows you to switch between pokemon in battle
* Story mode feature with developed plot.
* Networked play
* Graphics include more complex images and icons
* Animations - The pokemon shake a little when attacked.


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* A map that we are able to traverse with different locations that have different graphics
* Sprites for not only pokemon but also player and other npc’s
* Individual theme music for different fights




Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]


UML Diagram: https://drive.google.com/file/d/1ik9_l0lyTkFh7xmhQdR7jG4W_QqNKYoa/view?usp=sharing 
* Pokemon Package
   * Pokemon.java: Each pokemon has an “element” and their effectiveness to fight varies depending on the element of their opponent (i.e water would be strong when fighting fire). Each pokemon has fields which tracks the health and the 3 different attacks a pokemon can do.
      * Pikachu.java (extends)
      * Charmander.java (extends)
      * JigglyPuff.java (extends)
      * Squirtle.java (extends)
      * Bulbasaur.java (extends)
* Player Package
   * Player.java: Represents a person. This class will lay the framework for the player to choose attacks and form teams.
   * TeamPanel.java: a panel with customizable pokemon fields based on user input.
   * AttackPanel.java: This panel has buttons which allow you to select different attacks depending on the pokemon. Each pokemon has 3 attacks.
* Battleground Package
   * Stage.java: Represents the stage on which the pokemon will fight and contains the Graphical User Interface. 
   * StatsBoard.java - This will keep track and display the time fighting and HP of the pokemon on a panel.
   * SelectTeam.java: A Jframe drop down that allows you to choose team members.
* Default Package
   * Main.java: implements drawing surface
   * DrawingSurface.java
   * MenuPanel.java - the window that displays the game and contains buttons to the initial instructions menu and to start playing either on the same computer or networked.
   * EndPanel.java - the window that displays the winner of the fight and allows them to play another round.
Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
   * Kelsey
      * UML diagrams
      * Read me
      * Main
      * MenuPanel
      * EndPanel
      * Pokemon
         * Charmander
         * JigglyPuff
         * Pikachu
         * Bulbasaur
         * Squirtle
   * Isa
      * Pokemon
         * Charmander
         * JigglyPuff
         * Pikachu
         * Bulbasaur
         * Squirtle
      * Graphics
   * Rishi[d]
      * Pokemon
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]
   * Networking - Mr. Shelby
   * Controller Support library
      * https://github.com/williamahartman/Jamepad




[a]you've prob heard this before but isn't this a bit too similar to the actual version? i'd rename it at the least...
[b]elaborate. how do you increase hp? how do you attack? what body-part is moving (if any)? what does it look like?
[c]What does this look like in terms of your game? Will the pokemon be simple characters or will the whole game have simple animations? Overall, the features list says to fully describe each feature and there are only a few basic details for each description.
[d]I know you guys have barely started on the project, but just so that you have a base, you should try coming up with a breakdown of the code.