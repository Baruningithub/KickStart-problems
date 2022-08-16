import java.io.BufferedReader;
import java.io.InputStreamReader;

// find the minimum number of operations required to transform the given string into a string with goodness score equal to K.

class k_goodness_string{
    
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count=0;
        while (t>0){

        count++;
        
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        int goodness = 0;
        int n=s.length();
        for (int i=0;i<n/2;i++){
            if (s.charAt(i)!=s.charAt(n-i-1))
                goodness+=1; 
        }
        return Math.abs(goodness-k);
        t--;
    
    }
}
}