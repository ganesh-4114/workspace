package assessment;

class ColourChecking {
	float red = 193; float green = 255; float blue = 183;
	
	void  HSB() {
		red = red / 255;
		green = green / 255;
		blue = blue / 255;
		
		float cmax = Math.max(red, Math.max(green, blue));
		float cmin = Math.min(red, Math.min(blue, green));
		float diff = cmax - cmin;
		
		if (cmin == cmax) {
			System.out.println("0");
		}
		
		float hueVal = 0f;
		
		if (cmax == red) {             
			hueVal = (green - blue) / (cmax - cmin);
		} else if (cmax == green) {
			hueVal = 2f + (blue - red) / (cmax - cmin);
		} else {
			hueVal = 4f + (red - green) / (cmax - cmin);
		}
		
		hueVal = hueVal * 60;    //Hue calculation
	    if (hueVal < 0) hueVal = hueVal + 360;
	    System.out.println("Hue: " + hueVal);
		
		float saturation = (diff/cmax)*100;   //saturation calculation
		System.out.println("Saturation: " +saturation);
		
		float bright = (cmax*100);    //Brightness calculation
		System.out.println("Brightness: " + bright);
	}
	
}

public class HSB {

	public static void main(String[] args) {
		ColourChecking obj = new ColourChecking();
		obj.HSB();
		
	}

}
