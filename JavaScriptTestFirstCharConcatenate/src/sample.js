var text = '';
var splChars = "*|,\":<>[]{}`\';()@&$#%";
var arr = "Access *Java".split(' ');
for(i=0;i<arr.length;i++) {
    if (splChars.indexOf(arr[i].charAt(0)) == -1) {
				text += arr[i].substr(0,1);
    }
    else {
        text += arr[i].substr(1,1);
    }
}    
alert(text);