/*
		JAMSS - MS simulator
    Copyright (C) 2014  Rob Smith 2robsmith@gmail.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package simulatorGUI;

import java.util.Random;

/**
 *
 * @author rob
 */
public class RandomFactory {
	public static long cloneSeed;
	public static Random rand;
	public RandomFactory() {}
	public static void setSeed(){
		rand = new Random();
		if (cloneSeed == 0){
			cloneSeed = System.currentTimeMillis();
		}
		rand.setSeed(cloneSeed);
		MassSpec.simOptions = MassSpec.simOptions + "," + cloneSeed;
	}
}
