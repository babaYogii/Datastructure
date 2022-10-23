package RecursionProblems;

import java.util.ArrayList;

public class Array {
    private static int count;

    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,3};
//        System.out.println(Issorted(a,0));
//        System.out.println(IsPresent(a,5,0));
//        System.out.println(IspresentAtIndexx(a,5,0));
//        FindOccurence(a,0,3);
//        System.out.println(count);
        ArrayList<Integer> ans = findAllIndex(a,3,0,new ArrayList<Integer>());
        System.out.println("All index at which target is found are "+ans);
        System.out.println(findAllIndex2(a,3,0));
        System.out.println(rbs(a,3,0,a.length));
    }
    static boolean Issorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Issorted(arr , index+1);
    }

    static boolean IsPresent(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target ||  IsPresent(arr,target,index+1);
    }



    static int IspresentAtIndexx(int arr[],int target,int Index){
        if(Index==arr.length){
            return -1;
        }
        if(arr[Index]==target){
            return Index;
        }
        else{return IspresentAtIndexx(arr,target,Index+1);
    }

        }


        //Find where is the element present in array
        static ArrayList<Integer> list= new ArrayList<>();
        static void FindOccurence(int arr[],int Index,int target){
                 if(Index==arr.length){
                     return;
                 }
                 if(arr[Index]==target){
                     list.add(Index);
                     count++;
                 }
                  FindOccurence(arr,Index+1,target);
        }


        //find all index and return list of index where element are present

        static ArrayList<Integer> findAllIndex(int arr[],int target,int index,ArrayList<Integer> list){
            if(index==arr.length){
                return list;
            }
            if(arr[index]==target){
                list.add(index);
            }
            return findAllIndex(arr,target,index+1,list);
        }


        //Return all same variable index in the form of list while crating a arrayList inside function
        static  ArrayList<Integer> findAllIndex2(int a[],int target,int index){
            ArrayList<Integer> list = new ArrayList<>();
            if(index==a.length){
                return list;
            }
            if(a[index]==target){
                list.add(index);
            }

            ArrayList<Integer> ans=findAllIndex2(a,target,index+1);
            list.addAll(ans);
            return list;
        }


        // half array is sorted in that find the target element
         static int rbs(int arr[],int target,int s, int e){
            if(s>e){
                return -1;
            }
            int m=s+(e-s)/2;
            if(target==arr[m]){
                return m;
            }

            if(arr[s]<=arr[m]){
                if(target>=arr[s] && target<=arr[m]){
                    return rbs(arr,target,s,m-1);
                }else{
                    return rbs(arr,target,m+1,e);
                }
            }
            if(target>=arr[m] && target<=arr[e]){
                return rbs(arr,target,m+1,e);
            }
            return rbs(arr,target,s,m-1);

         }


}
