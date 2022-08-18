import java.io.BufferedReader;
import java.io.InputStreamReader;

// find the minimum number of operations required to transform the given string into a string with goodness score equal to K.

class k_goodness_string{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count=0;
        while (t>0){

        count++;
        String [] l1= br.readLine().split(" ");
        int n = Integer.parseInt(l1[0]);
        int k = Integer.parseInt(l1[1]);
        String [] l2= br.readLine().split(" ");
        String s ="";
        for (int i=0;i<n;i++)
            s+=l2[i];
        System.out.println(minops(s,n, k));

        t--;
    
    }
}
public static int minops(String s,int n,int k){
    int goodness = 0;

    for (int i=0;i<n/2;i++){
        if (s.charAt(i)!=s.charAt(n-i-1))
            goodness+=1; 
    }
    return Math.abs(goodness-k);
}
}
