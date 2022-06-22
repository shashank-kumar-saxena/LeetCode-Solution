/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    let str = "", st = "";
    for (var i = 0; i < s.length; i++) {
        if (/[a-zA-Z0-9]/.test(s[i])) {
            st = st + s[i];
            str = s[i] + str;
        }
    }
    str = str.toUpperCase();
    st = st.toUpperCase();
    if (str == st)
        return true;
    return (false);

};