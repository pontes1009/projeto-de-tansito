/*   
    Copyright (C) 2013 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/

package sim.traci4j.src.java.it.polito.appeal.traci;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Query for obtaining a set of {@link Vehicle}s.
 * 
 * @author Enrico Gueli &lt;enrico.gueli@polito.it&gt;
 *
 */
public class VehicleSetQuery extends ObjectCollectionQuery<Vehicle, Set<Vehicle>> {
	VehicleSetQuery(DataInputStream dis, DataOutputStream dos,
			int commandID, String objectID,	int varID, Repository<Vehicle> repository) {
		super(dis, dos, commandID, repository, objectID, varID);
	}

	@Override
	protected Set<Vehicle> makeCollection() {
		return new HashSet<Vehicle>();
	}
}