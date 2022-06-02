/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let maxLength = 0
    for (let i = 0; i < sentences.length; i++) {
        maxLength = Math.max(maxLength,sentences[i].split(" ").length)        
    }
    return maxLength
};