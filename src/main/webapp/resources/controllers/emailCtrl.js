
//var app = angular.module("myApp", ["ngRoute"]);

myApp.controller("emailCtrl", function ($scope,$http) {
	console.log("name");
    $scope.msg = "";
	
	$http({
method: 'GET',
cache: true,
url: "http://localhost:8081/email"
}).then(function successCallback(response) {

var resData=response.data;
//$scope.dashboard=resData;
console.log("==");
console.log(resData);
console.log("==");

var box1Res=resData[0];
var fnlBox1=box1Res.Box1;
//var fnlImage=imageRes.image;
//$scope.harishKKK=resData;
$scope.box1Contents=fnlBox1.Contents;
$scope.defname=fnlBox1.label;
$scope.sname=fnlBox1.label1;
//$scope.imname=fnlBox1.image;




}, function errorCallback(response) {
//console.log(response);
console.log('err');

});
});