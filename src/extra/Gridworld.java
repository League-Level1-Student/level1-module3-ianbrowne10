package extra;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	public static void main(String[] args) {
		int random = new Random().nextInt(10);
		World w = new World();
		Bug b = new Bug();
		Bug b2 = new Bug();
		Flower f = new Flower();
		Flower f2 = new Flower();
		Color color = new Color(50, 25, 150);
		b2.setColor(color);
		b2.act();
		b2.act();
		Location l = new Location(2, 7);
		Location q = new Location(random, random);
		Location l2 = new Location(2, 8);
		Location l3 = new Location(2, 6);
		for (int y = 0; y < 10; y++) {

			for (int x = 0; x < 10; x++) {
				Location i = new Location(x, y);
				Flower d = new Flower();
				w.add(i, d);
			}
		}

		w.show();

		w.add(q, b2);
		w.add(l, b);
		w.add(l2, f);
		w.add(l3, f2);

	}
}
