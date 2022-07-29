//https://leetcode.com/problems/find-and-replace-pattern/
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int count =0;
        int len = pattern.length();
        List<String> list= new ArrayList<String>();
        int arr[] = new int[len];
        arr[0]=0;
        for(int i=1;i<len;i++){
            if(pattern.charAt(i)==pattern.charAt(i-1)){
                arr[i]=count;
                continue;
            }
            else{
                int f=0;
                for(int j=i-1;j>=0;j--){
                    if(pattern.charAt(j)==pattern.charAt(i)){
                        arr[i]=arr[j];
                        f = 1;
                        break;
                    }
                }
                if(f==0){
                count++;
                arr[i]=count;
                }
            }
        }
        for( String str: words ){
            int flag= 0,k=0;
            int temp[] = new int[len];
            temp[0]=0;
            for(int i=1;i<len;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                temp[i]=k;
                continue;
            }
            else{
                int f=0;
                for(int j=i-1;j>=0;j--){
                    f=0;
                    if(str.charAt(j)==str.charAt(i)){
                        temp[i]=temp[j];
                        f = 1;
                        break;
                    }
                }
                if(f==0){
                k++;
                temp[i]=k;
                }
            }
        }
        
        for(int l=0;l<len;l++){
            if(arr[l]!=temp[l]){
                flag=1;
                break;
            }
        }
            if(flag==0)
                list.add(str);
        }
        return list;
    }
}
