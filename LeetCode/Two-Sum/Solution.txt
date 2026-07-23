1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4       vector<int> result=nums;
5        vector<int> answer;
6        sort(nums.begin(),nums.end());
7        int start=0,end=nums.size()-1;
8          while(start<end){
9            if(nums[start]+nums[end]==target){
10                start=nums[start];
11                end=nums[end];
12                break;
13            }
14            else if(nums[start]+nums[end]>target) end--;
15            else start++;
16        }
17        for(int i=0;i<result.size();i++){
18            if(result[i]==start) answer.push_back(i);
19            else if(result[i]==end) answer.push_back(i);
20        }
21
22            return answer;
23    }
24};