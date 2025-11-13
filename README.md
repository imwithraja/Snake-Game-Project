# Snake-Game-Project
A classic arcade-style Snake game built in Java using AWT and Swing for the GUI framework. The player controls a snake that moves around the window, eats food to grow longer, and must avoid colliding with walls or its own body. The game includes score tracking, increasing difficulty, and simple keyboard controls.

Key features
Real-time grid-based movement and smooth animation using a game loop (Timer).
Food spawning at random positions; snake length increases when food is eaten.
Collision detection for walls and self-collision (game over conditions).
Score display and optional high-score persistence.
Simple, responsive keyboard controls (arrow keys or WASD).

Technical details
UI: JFrame and custom JPanel (Swing) for the game canvas; paintComponent(Graphics g) (AWT Graphics) for drawing.
Game loop: javax.swing.Timer or a dedicated thread to update game state and repaint at fixed intervals.
Data structures: LinkedList<Point> or ArrayList<Point> to store snake segments.
Movement logic: maintain current direction; on each tick, insert a new head based on direction and remove the tail unless food eaten.
Collision detection: check if head coordinates match any body segment or are outside the game bounds.

Why this project is valuable
Demonstrates mastery of core Java (OOP, collections, exception handling).
Shows practical use of Swing/AWT for GUI programming and custom drawing.
Covers real-time programming concepts (game loop, timing, input handling).
Good for demonstrating debugging skills, event-driven design, and UI design basics.
