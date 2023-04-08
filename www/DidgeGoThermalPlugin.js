var exec = require('cordova/exec');

exports.startThermalCamera = function (arg0, success, error) {
    exec(success, error, 'DidgeGoThermalPlugin', 'startThermalCamera', [arg0]);
};

exports.closeThermalCamera = function (arg0, success, error) {
    exec(success, error, 'DidgeGoThermalPlugin', 'closeThermalCamera', [arg0]);
};
