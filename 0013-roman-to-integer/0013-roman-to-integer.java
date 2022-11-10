class Solution {
    public int romanToInt(String s) {
		int sum =0;
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'I')
				sum += 1;
			else if(s.charAt(i) == 'V'){
				if(i>0 && s.charAt(i-1) == 'I'){
					sum -=1;
					sum+=4;
				
				}
				else sum += 5;
			}
				
			else if(s.charAt(i) == 'X'){
				if(i>0 && s.charAt(i-1) == 'I'){
					sum -=1;
					sum+=9;
					
				}
				else sum += 10;
			}
			else if(s.charAt(i) == 'L'){
				if(i>0 && s.charAt(i-1) == 'X'){
					sum -=10;
					sum+=40;
					
				}
				else sum += 50;
			}
			else if(s.charAt(i) == 'C'){
				if(i>0 && s.charAt(i-1) == 'X'){
					sum -=10;
					sum+=90;
					
				}
				else sum += 100;
			}
			else if(s.charAt(i) == 'D'){
				if(i>0 && s.charAt(i-1) == 'C'){
					sum -= 100;
					sum+=400;
					
				}
				else sum += 500; 
			}
			else if(s.charAt(i) == 'M'){
				if(i>0 && s.charAt(i-1) == 'C'){
					sum -= 100;
					sum+=900;
					
				}
				else sum += 1000;
			}
		}
		return sum;
    }
}