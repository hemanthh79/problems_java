class Solution {
    public int[] decrypt(int[] code, int k) 
    {
        int len = code.length;
        int[] result = new int[len];
        if(k==0)
        {
            Arrays.fill(result,0);
            return result;
        }
        for(int i=0;i<len;i++)
        {
            int sum=0;
            if(k>0)
            {
                for(int j=1;j<=k;j++)
                {
                    sum+=code[(i+j)%len];
                }
            }
            else
            {
                for(int j=1;j<=-k;j++)
                {
                    sum+=code[(i-j+len)%len];
                }
            }
            result[i]=sum;
        }
        return result;

    }
}
class bomb_diff
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of the array");
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter array elements: \n");
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         Solution sol = new Solution();
         int[] decrypted = sol.decrypt(arr,k);
         System.out.println("Output array :");
         for(int i : decrypted)
         {
            System.out.print(i + " ");
         }

    }
}