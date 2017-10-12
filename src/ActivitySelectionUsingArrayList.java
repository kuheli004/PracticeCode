import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ActivitySelectionUsingArrayList {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt(),n;
    for(int tc=0;tc<t;tc++){
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        Map<Integer,ArrayList<Integer>> m=new TreeMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        // relative sorting
        for(int i=0;i<n;i++){
            if(m.containsKey(b[i]))
                m.get(b[i]).add(a[i]);
            else{
                ArrayList<Integer> l=new ArrayList<Integer>();
                l.add(a[i]);
                m.put(b[i],l);
            }
        }
        //Set<Integer> s=m.keySet();
        //System.out.println(s);
        int ind1=0,ind2=0;
        for(Integer itr:m.keySet()){
           for(int i=0;i<m.get(itr).size();i++){
               a[ind1]=m.get(itr).get(i);
               b[ind2]=itr;
               ind1++;
               ind2++;
           }
        }
      /*  for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
      System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");*/
        //System.out.println(m);
        int count=1,max=b[0];
        for(int i=1;i<n;i++){
            if(a[i]>=max){
                count++; max=b[i]; }
        }
        System.out.println(count);
    }

  }

}
