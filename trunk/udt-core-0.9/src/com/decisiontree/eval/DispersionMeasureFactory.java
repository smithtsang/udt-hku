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
package com.decisiontree.eval;

import org.apache.log4j.Logger;

/**
*
* DispersionMeasureFactory
*
* @author Smith Tsang
* @since 0.9
*
*/
public class DispersionMeasureFactory {

	public static Logger log = Logger.getLogger(DispersionMeasureFactory.class);

	public static DispersionMeasure createDispersionMeasure(String dispersionStr){
		DispersionMeasure dispersion = null;
		if(dispersionStr == DispersionMeasure.ENTROPY)
			dispersion = new EntropyFunction();
		else {
			log.error("Incorrect dispersion measure is selected.");
		}
		return dispersion;
	}



}
