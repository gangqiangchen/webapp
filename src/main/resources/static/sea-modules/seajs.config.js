// seajs config
seajs.config({
    base : "/sea-modules/",
    alias : {
        "jquery" : "/js/jquery-3.1.1.min.js",
        "bootstrap" : "/bootstrap/js/bootstrap.min.js",
    },
    preload : [ 'jquery' ],
    charset: 'utf-8'
});
