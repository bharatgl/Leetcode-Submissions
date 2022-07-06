/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    let count = 0;

  for (let i = 0; i < words.length; i++) {
    let word = words[i];
    let flag = true;

    for (let j = 0; j < word.length; j++) {
      let letter = word[j];
    //   console.log(allowed.indexOf(letter))
    //   console.log(letter)
      if (allowed.indexOf(letter) == -1){
        flag = false;
      }
    }

    if (flag) count++;
  }

  return count;
};