package comm1;
public class CountAlphabets
{
		public static void main(String[] args)
		{
			String s="aabbcaaddccggaagd";
			int arr[]=new int[256];
			for(int i=0;i<s.length();i++)
			{
			int x=s.charAt(i);
			arr[x]++;
			}
			for(int j=0;j<arr.length;j++)
			{
			if(arr[j]!=0)
			{
					System.out.println("charter ="+(char)j +" count="+arr[j]);
			}
			}
			
		}
}

