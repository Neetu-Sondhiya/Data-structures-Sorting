class Merge_two_sorted_Array{
    public static void main(String[] args)
    {
        int b[] = {10,20,30,40,50,60};
        int a[] = {15,25,30,45,70,80,90,122};
        int [] ans = merge(a,b);
        for(int  val: ans)
            System.out.print(val+" ");
    }
    public static int[] merge(int[] arr1 ,int[] arr2 )
    {
        int[] merge = new int[arr1.length+arr2.length];

        int i = 0 ; 
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                merge[k++] = arr1[i++];
            }
            else
            {
                merge[k++]= arr2[j++];
            }
        }

        if(i==arr1.length)
        {
            while(j<arr2.length)
            {
                merge[k++]=arr2[j++];
            }
        }
        else{
            while(i<arr1.length)
            {
                merge[k++]=arr1[i++];
            }
        }

        return merge;
    }
}