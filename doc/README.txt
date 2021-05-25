Pokemon Fighting
Authors: Isa Pudiyapura, Rishi Zamvar, Kelsey Shan
Revision: 5/25/2021 


Introduction: 


In the year 3000, a swarm of never before seen animal species breached the earth’s 
atmosphere through a tear in the time-space continuum. As more research was done on the 
peculiar creatures, we have discovered a way to befriend and adopt them. Before long, a new 
sport where pokemon-trainer duos could duel was created: Pokemon Fighting. 


You have finally turned the ripe age of 10 and have begun to set out on the greatest adventure 
of your life. While many children applied to become a trainer, you are one of the chosen few 
who will learn to be a pokemon trainer because of your perseverance, mental disciple, and 
innate ability. With only a handful of starting pokemon, you set off to create an invincible team 
and become the greatest trainer of all time.


In this turn based multiplayer pokemon game, players take turns attacking their opponent and 
battling to determine a winner. Each battle you win will help level up your pokemon and make 
you stronger. In battle, you face off with one opponent and are allowed one pokemon out. 
Battles follow a tag-team style, and your choice of pokemon can be strategically switched out 
based on attributes or health. 


Instructions:
1. The game opens up on a main menu with two buttons: Instructions and Play. The instructions button will open a list with the rules to play the game. 
2. When the players decide to play, they will be brought to a screen with two columns of Pokemon buttons containing all 5 possible pokemon. The player will use the mouse to select a pokemon to join their team by clicking the buttons with the pokemon’s name. 
3. After both players have choses a team member, they will click the “Done Choosing” button. They are unable to continue if they do not choose.
4. They will be taken to that battle screen with the different moves of the Pokemon they have selected and the health. 
5. The players will also have access to a panel of buttons labeled with the attacks possible. When the turn switches, the names of the moves change to the next player
6. There is also a music button located in the top left corner of the battle screen. Players can choose to play music or not while playing the game by toggling the button.
7. The fight will alternate between players and allow them to select moves when it is their turn. There are a variety of different moves including attacks and protecting oneself.
8. A player loses once the pokemon that is currently deployed loses all its HP.
9. Once someone loses, you are brought to the ending screen. The winner will be displayed on the screen. There will also be buttons to “Main Menu” and “Fight Again”. “Fight again” will take the player back to the fighting screen with the platforms and they will be able to fight again. “Main Menu” sends them back to the starting screen.
**Click on the ‘X’ button on the top right hand corner to exit the game. 


Features List:
Must-have Features:
* [DONE] Menu that includes instructions and how to play the game
* [DONE] Players can win or lose battles by defeating(die/kill) an opponent's pokemon
* [DONE] Two players can play on the same computer
* [DONE] 5 pokemon with different attack values, HP, and attributes. There will be different attack values low, middle, high. HP and other attributes will have a starting value which increases as the pokemon levels up. When a pokemon defeats another, it increases a scaling factor that will be used as a multiplier for the HP and attack attributes.
* [DONE] Simple 2-Dimensional graphics. The pokemon will be image icons and the background set up will be composed of basic shapes


Want-to-have Features:
* A Xbox controller input in addition to mouse input
* A customizable 3 pokemon team that allows you to switch between pokemon in battle
* Story mode feature with developed plot.
* Networked play
* 3D Graphics or include more complex images and icons
* [DONE] Animations - The pokemons shake a little when attacked.
* [DONE] Background music - Music can be played in the background of a fight


Stretch Features:
* A map that we are able to traverse with different locations that have different graphics
* Sprites for not only pokemon but also player and other npc’s
* Individual theme music for different fights


Class List:
* Pokemon Package
   * Pokemon.java: Each pokemon has an “element” and their effectiveness to fight varies depending on the element of their opponent (i.e water would be strong when fighting fire). Each pokemon has fields which track the health and the 3 different attacks a pokemon can do.
      * Pikachu.java (extends)
      * Charmander.java (extends)
      * JigglyPuff.java (extends)
      * Squirtle.java (extends)
      * Bulbasaur.java (extends)
* Game Package
   * Game.java: The class where the game is played with the act method and different methods representing what can be done during a game.
* Menus Package
   * Main.java: implements drawing surface
   * DrawingSurface.java: Contains different user interaction methods and draws the different active screens.
   * ScreenSwitcher: The interface that switches between different PApplet screens.
   * Screen: The superclass for PApplet screens
      * BattleScreen.java (extends): Represents the stage on which the pokemon will fight and contains the Graphical User Interface. 
      * SelectScreen.java (extends): A window screen with different options of pokemon to select.
      * MenuScreen.java (extends): The window that displays the game and contains buttons to the initial instructions menu and to start playing.
      * EndScreen.java (extends): The window that displays the winner of the fight and allows them to play another round.
      * RuleScreen (extends): The PApplet screen that displays the rules of the game.
Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Kelsey
      * UML diagrams updater
      * README updater
      * Javadocs updater
      * Main
      * MenuScreen
      * RuleScreen
      * DrawingSurface
      * ScreenSwitcher
      * Screen
      * SelectScreen
      * Game
      * EndScreen
      * BattleScreen
      * Game
      * Music - Want to have feature
      * Created and edited the presentation
      * Organized our work schedule
* Isa
      * BattleScreen
      * Game
      * Animations - Want to have feature
* Rishi
      * Pokemon
         * Charmander
         * JigglyPuff
         * Pikachu
         * Bulbasaur
         * Squirtle
      * Game
      * Animations - Want to have feature
      * BattleScreen
* Outside Resources
   * Processing Screen Switching - Mr. Shelby
   * Processing Sounds - Mr. Shelby
   * Game Images and Sounds
      * charmander
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinclipart.com%2Fpindetail%2Fowwboi_pokemon-fire-red-charmander-sprite-clipart%2F&psig=AOvVaw2hR1k18PhDaPVy3lHDoQ8P&ust=1620839867962000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNiZn5eRwvACFQAAAAAdAAAAABAD
      * pikachu
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngjoy.com%2Fpreview%2Fx6d8q8b3i0d9j8_pokemon-pikachu-female-pikachu-sprite-gif-png-download%2F&psig=AOvVaw1vR79NuVQCmw2g0aPfFHXG&ust=1620840041694000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNCM4YmSwvACFQAAAAAdAAAAABAD
      * bulbasaur
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngfind.com%2Fmpng%2FiRJiho_bulbasaur-png-image-with-transparent-background-bulbasaur-sprite%2F&psig=AOvVaw1sacsxfs--LsHCo6vQREN7&ust=1620839995827000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCODo8ZCSwvACFQAAAAAdAAAAABAD
      * jiggly puff
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngaaa.com%2Fdetail%2F3980771&psig=AOvVaw2xfH1nRSxRqu38mnaMPB2r&ust=1620840074789000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNCB6PqRwvACFQAAAAAdAAAAABAD 
      * Squirtle
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngkey.com%2Fmaxpic%2Fu2e6y3i1e6o0a9t4%2F&psig=AOvVaw262OfgfqdGdCy2uqzyFz0y&ust=1621099685143000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPiJxo7ZyfACFQAAAAAdAAAAABAE
      * Background
         * https://wallpaperaccess.com/full/1089608.png 
      * Battle Music
         * https://www.youtube.com/watch?v=L5wyctbkgGk 
      * Fighting Background
         * https://i.pinimg.com/originals/20/fe/1e/20fe1e143ea1bb175a2035b1d180e398.jpg 
      * End Screen Background
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Ftolunaygenc.artstation.com%2Fprojects%2FxzXw2X%3Falbum_id%3D2663024&psig=AOvVaw3t2Sr0iYb3qs96QRmWYIIa&ust=1621576660163000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPDU1_7J1_ACFQAAAAAdAAAAABAn 
      * Electric Logo
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Ftoppng.com%2Fpokemon-electric-type-stickers-by-cat-games-inc-electric-energy-pokemon-symbol-PNG-free-PNG-Images_205861&psig=AOvVaw2-yeJYBeR4nfUm6un-nTgI&ust=1621986481264000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKie_NPA4_ACFQAAAAAdAAAAABAK
      * Fire
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.clipartmax.com%2Fmiddle%2Fm2i8G6N4m2A0H7N4_fire-type-pokemon-symbol-pokemon-fire-type-logo%2F&psig=AOvVaw2W-1dB_q5a0eoBPkCE9hAt&ust=1621986541966000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIDC2O_A4_ACFQAAAAAdAAAAABAD
      * Water
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F451697037608959177%2F&psig=AOvVaw16YR03j_rWLaV3Lp9Apnnv&ust=1621986576855000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIi72ILB4_ACFQAAAAAdAAAAABAD
      * Normal
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.deviantart.com%2Fhumac1%2Fart%2FColorless-Energy-303829662&psig=AOvVaw0zV8MW1lZ9DBXsBB1-yO70&ust=1621986611452000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJiYp5HB4_ACFQAAAAAdAAAAABBC
      * Grass
         * https://www.google.com/url?sa=i&url=https%3A%2F%2Fpokemonenglish.fandom.com%2Fwiki%2FGrass_Type&psig=AOvVaw3gIIaLKaM2PtWR4YEPdvg1&ust=1621986701781000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKD85bvB4_ACFQAAAAAdAAAAABAD
      * Protect move emblem
      	*https://cdn2.iconfinder.com/data/icons/flat-icons-19/512/Shield.png

