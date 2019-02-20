package extra;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {


public static void main(String[] args) {
	World w = new World();
Bug b = new Bug();
Location l = new Location(2,7);	
w.show();

	w.add(l,b);
}
}
