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
 console.log(store);
 return store;
};
function oneNine(num)
{
  if(num==0)
  return "";
  if(num==1)
  return "I";
  if(num==2)
  return "II";
  if(num==3)
  return "III";
  if(num==4)
  return "IV";
  if(num==5)
  return "V";
  if(num==6)
  return "VI";
  if(num==7)
  return "VII";
  if(num==8)
  return "VIII";
 if(num==9)
  return "IX";
  if(num==0)
  return "";
}
function tenToNine(num)
{
if(num==1)
return "X";
if(num==2)
return "XX";
if(num==3)
return "XXX";
if(num==4)
return "XL";
if(num==5)
return "L";
if(num==6)
return "LX";
if(num==7)
return "LXX";
if(num==8)
return "LXXX"; 
if(num==9)
return "XC";
if(num==0)
return ""; 
}
function hundredTo(num)
{
  if(num==1)
  return "C";
  if(num==2)
  return "CC";
  if(num==3)
  return  "CCC";
  if(num==4)
  return  "CD";
  if(num==5)
  return  "D";
  if(num==6)
  return  "DC";
  if(num==7)
  return  "DCC";
  if(num==8)
  return  "DCCC";
  if(num==9)
  return  "CM";
  if(num==0)
  return "";
}
function thousandTO(num)
{
  if(num==0)
  return "";
   if(num==1)
  return "M";
   if(num==2)
  return "MM";
   if(num==3)
  return "MMM";
   if(num==4)
  return "MMMM";
}
