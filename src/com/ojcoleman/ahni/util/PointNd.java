package com.ojcoleman.ahni.util;

public class PointNd {
	
	public double[] coords;
	
	public PointNd() {
		
	}
	
	public PointNd(double[] cs) {
		this.coords = cs;
	}
	
	@Override
	public int hashCode() {
		int summies = 0;
		for(int ix = 0; ix < this.coords.length; ix++) {
			summies += this.coords[ix];
		}
		return (int) (summies * (Integer.MAX_VALUE/3));
	}
	
	public boolean equals(PointNd o) {
		boolean r_val = true;
		for(int ix = 0; ix < this.coords.length; ix++) {
			if(this.coords[ix] != o.coords[ix]) {
				r_val = false;
			}
		}
		return r_val;
	}
	
	public String toString() {
		return this.coords.toString();
	}
	
	public void setCoords(double[] dem_coords) {
		this.coords = dem_coords;
	}
}
