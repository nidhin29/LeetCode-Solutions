var jump = function(nums) {
    let destination = nums.length -1;
    let coverage = 0;
    let lastIndex = 0;
    let steps = 0;
    if(nums.length == 1)
    {
      return 0;
    }
 
    for(let index=0;index<nums.length;index++)
    {
       coverage = Math.max(coverage,index+nums[index]);
       if(lastIndex == index)
       {
            lastIndex = coverage;
            steps++;
       
       if(coverage >= destination)
       {
         return steps;
       }}
    }
    return steps;
 };