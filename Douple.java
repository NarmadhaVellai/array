package Arrays;

import java.util.*;

public class Douple {
public static void main(String[] args) {
			double[] input=new double[]{625615.7528, 73465147.008, 41624.2712, 274.0009};
			System.out.println(ConvertToDolarFormat(input));
		}

	private static String ConvertToDolarFormat(double[] input) {
		String[] output=new String[input.length];
		int i=0;
		for(double num:input) {
			String str=String.valueOf(num);
			int x= str.indexOf(".");//x=dot
			if(str.length()>x+3) {
			str=str.substring(0,x+3);
			}
			if(x>3) {
				str=str.substring(0,x-3)+","+str.substring(x-3);
			}
			int y=str.indexOf(".");//y=comma
			while(y>2) {
				str=str.substring(0,y-2)+","+str.substring(y-2);
				y=str.indexOf(",");
			}
			str="\"$"+str+"\"";
			output[i++]=str;
		}
			return Arrays.toString(output);	 
		}
	}


