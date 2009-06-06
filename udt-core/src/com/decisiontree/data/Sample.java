/**
 * Decision Tree Classification With Uncertain Data (UDT)
 * Copyright (C) 2009, The Database Group, 
 * Department of Computer Science, The University of Hong Kong
 * 
 * This file is part of UDT.
 *
 * UDT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * UDT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.decisiontree.data;

/**
 * 
 * Sample - Represents a sample value of a interval-valued attribute
 *
 * @author Smith Tsang
 * @version 26 May 2009
 *
 */

public class Sample extends PointAttribute{
	private double cdist;

	public Sample(double value, double cdist){
		setValue(value);
		this.cdist =cdist;
	}

	public double getCDist(){
		return cdist;
	}
	
	@Override
	public int compareTo(Object o){
		double diff = getValue() - ((Sample)o).getValue();
		if(diff > 0) return 1;
		else if( diff ==0) return 0;
		else return -1;
	}

}