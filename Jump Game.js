var canJump = function(nums) {
    let finalPosition = nums.length-1;
    for(let index=nums.length-2;index>=0;index--)
    {
        if((index+nums[index]>= finalPosition))
        {
          finalPosition=index;
        }
    }
    return finalPosition == 0;
};