//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    }
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 
    
class GFG {
    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    
            Solution ob = new Solution();
            int ans = ob.solve(a, b, c);
            
            out.println(ans);
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int solve(int a, int b, int c) {
        // code here
        int count =0;
// 		System.out.println("a = " + a + " b = " + b + "c = " + c);
		Stack<Integer> st = new Stack<>();
        while(true){
			if(a == b && b ==c && c == a) break;
            int x1= 0;
			int x2 = 0;
			if(st.size() >= 2){
				x1 = st.pop();
				
				x2 = st.pop();
				// System.out.println(x1 + " " + x2);
				st.push(x2);
				st.push(x1);
			}

			if( x1 != 0 && x1 == x2 ){

				if(x1 == 1){

					if(b == 0 && c == 0) return -1;
					if(b > c){
						b--;
						count++;
						st.clear();
						st.push(2);
					}else{
						c--;
						count++;
						st.clear();
						st.push(3);
					}
				}else if(x1 == 2){
					if(a ==0 && c ==0) return -1;
					if(a > c){
						a--;
						count++;
						st.clear();
						st.push(1);
					}else{
						c--;
						count++;
						st.clear();
						st.push(3);
					}
				}else{
					if(a == 0 && b ==0 ) return -1;
					if (a > b) {
						a--;
						count++;
						st.clear();
						st.push(1);
					} else {
						b--;
						count++;
						st.clear();
						st.push(2);
					}
				}
				
				// System.out.println("a = " + a + " b = " + b + "c = " + c);
				continue;
			}

			if(a >= b  && a > c){
                a--;
				st.push(1);
                count++;
            }
            else if( b > a && b >= c){
                b--;
				st.push(2);
                count++;
            }else if(c >= a && c > b){
                c--;
				st.push(3);
                count++;
            }
			
// 			System.out.println("a = " + a + " b = " + b + "c = " + c);
			
        }

		if (a == 0)
			return count;
		else {

			count = count + a + b + c;
			return count;
		}
		
     
    }
};