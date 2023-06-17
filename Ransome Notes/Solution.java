/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let obj1 = {}, obj2={};
    for(let i=0; i<=ransomNote.length-1; i++){
        if(obj1[ransomNote[i]]===undefined){
           obj1[ransomNote[i]]=1 
        } else {
            obj1[ransomNote[i]]++;
        }
    }

    for(let i=0; i<=magazine.length-1; i++){
        if(obj2[magazine[i]]===undefined){
           obj2[magazine[i]]=1 
        } else {
            obj2[magazine[i]]++;
        }
    }

    for(let key in obj1){
        if(obj2[key]===undefined || obj1[key] > obj2[key]){
            return false;
        }
    }
    return true;
};
2