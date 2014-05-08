/** jsierraecg - DecodedLead.java
 *  Copyright (c) 2011 Christopher A. Watford
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of
 *  this software and associated documentation files (the "Software"), to deal in
 *  the Software without restriction, including without limitation the rights to
 *  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do
 *  so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package org.cvrgrid.schiller;

import java.util.ArrayList;
//import java.util.Iterator;

/** Represents the decoded and decompressed data for a lead.
 * @author Christopher A. Watford
 * 
 */
public class DecodedLead {
	private String name;
	private int[] data;

	public String getName() {
		return this.name;
	}

	public int size() {
		return this.data.length;
	}

	public int get(int index) {
		return this.data[index];
	}

	private DecodedLead(int index, int[] data) {
		this.name = createNameFromLeadIndex(index);
		this.data = data;
	}

	public static DecodedLead[] createFromLeadSet(String leadSet, int[]... leadData) {
		DecodedLead[] leads = new DecodedLead[leadData.length];
		for (int lead = 0; lead < leadData.length; ++lead) {
			leads[lead] = new DecodedLead(lead, leadData[lead]);
		}
		return leads;
	}

	public static DecodedLead[] createFromLeadSet(ArrayList<int[]> leadData) {
		int index = 0;
		DecodedLead[] leads = new DecodedLead[leadData.size()];
		for (int[] lead : leadData) {
			leads[index] = new DecodedLead(index, lead);
			if (++index == leads.length)
				break;
		}
		return leads;
	}

	public static String createNameFromLeadIndex(int index) {
		switch (index) {
		case 0:
			return "Lead I";
		case 1:
			return "Lead II";
		case 2:
			return "Lead III";
		case 3:
			return "Lead aVR";
		case 4:
			return "Lead aVL";
		case 5:
			return "Lead aVF";
		case 6:
			return "Lead 6V";
		case 7:
			return "Lead 7V";
		case 8:
			return "Lead 8V";
		case 9:
			return "Lead 9V";
		case 10:
			return "Lead 10V";
		case 11:
			return "Lead 11V";
		case 12:
			return "Lead V3R";
		case 13:
			return "Lead V4R";
		default:
			return "Unknown Lead";
		}
	}
	
	public String toString() {
		return this.name + " (" + this.data.length + " samples)";
	}
}