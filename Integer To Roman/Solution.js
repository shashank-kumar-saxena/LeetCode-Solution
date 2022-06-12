/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    var store="";
 var i=0;
 while(num>0)
 {
   if(i==0)
   {
store=oneNine(num%10)+ store;
num=Math.floor(num/10);
   }
   else if(i==1)
   {
store=tenToNine(num%10)+ store;
num=Math.floor(num/10);
   }
   else if(i==2)
   {
     store=hundredTo(num%10)+ store;
     num=Math.floor(num/10);
     console.log(num);
   }
   else
   if(i>2 && num<5)
    {
      store=thousandTO(num%10)+store;
      num=Math.floor(num/10);
    }
 i++;
}
 return store;
};
function oneNine(num)
{
    switch(num)
        {
            case 0:
                  return "";
                break
            case 1:
                  return "I";
                break
            case 2:
                  return "II";
                break
            case 3:
                  return "III";
                break
            case 4:
                  return "IV";
                break
            case 5:
                  return "V";
                break
            case 6:
                  return "VI";
                break
            case 7:
                  return "VII";
                break
                case 8:
                  return "VIII";
                break
            case 9:
                  return "IX";
                break 
        }
}
function tenToNine(num)
{
    switch(num)
        {
            case 0:
                  return "";
                break
            case 1:
                return "X";
                break
            case 2:
                return "XX";
                break
            case 3:
                return "XXX";
                break
            case 4:
                return "XL";
                break
            case 5:
                return "L";
                break
            case 6:
                return "LX";
                break
            case 7:
                return "LXX";
                break
                case 8:
                return "LXXX"; 
                break
            case 9:
                return "XC";
                break 
        }
}
function hundredTo(num)
{
    switch(num)
        {
            case 0:
                  return "";
                break
            case 1:
                  return "C";
                break
            case 2:
                  return "CC";
                break
            case 3:
                  return  "CCC";
                break
            case 4:
                  return  "CD";
                break
            case 5:
                  return  "D";
                break
            case 6:
                  return  "DC";
                break
            case 7:
                  return  "DCC";
                break
                case 8:
                  return  "DCCC";
                break
            case 9:
                  return  "CM";
                break 
        }
}
function thousandTO(num)
{
    switch(num)
        {
            case 0:
                return "";
                break
            case 1:
                return "M";
                break
            case 2:
                return "MM";
                break
            case 3:
                return "MMM";
                break
            case 4:
                  return "MMMM";
                break
    
        }
}
