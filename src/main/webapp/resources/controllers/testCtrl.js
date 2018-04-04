myApp.controller("testCtrl", function ($scope,$http) {
			console.log("name");
			$scope.msg = "";
	
	$http({
			method: 'GET',
			cache: true,
			url: "http://localhost:8085/user/articles"
		}).then(function successCallback(response) {

var resData=response.data;
console.log("==");
console.log(resData);

var boxRes=resData[0];
var fnlBox=boxRes.boxes;
console.log(fnlBox);
$scope.boxes=fnlBox;

var Com=resData[1];
var fnlCom=Com.Completion;
console.log("Completion");
console.log(fnlCom);
$scope.completion=fnlCom;


/////stack stats/////////
 var Sale=resData[7];
 var fnlSale=Sale.Sale_Stats;
 console.log("SaleStats");
 console.log(fnlSale);
 $scope.SaleStats=fnlSale;
 var data =fnlSale;

 if(data){
	console.log('test load');
	console.log(data.length);
	var dataLeg=data.length;
	console.log(dataLeg);
	 var name="popped";
	 var domains = [];
			 for(var k=0; k<=dataLeg;k++){
				 console.log(data[k]);
				 domains.push(data[0].Domains);
				 }
			 console.log(domains);
			
				 var d1 = [];
				 for (var i = 0; i < Math.PI * 2; i += 0.5) {
					d1.push([i, Math.sin(i)]);
				 }
			
				 var d2 = []; 
				 for (var i = 0; i < Math.PI * 2; i += 0.5) {
					 d2.push([i, Math.cos(i)]);
				 }
			
				 var d3 = [];
			 for (var i = 0; i < Math.PI * 2; i += 0.2) {
					 d3.push([i, Math.tan(i)]);
				 }
				
			
				 var sales_charts = $('#sales-charts').css({'width':'100%' , 'height':'220px'});
				 $.plot("#sales-charts", [
				 { label: "name", data: d1 },
				 { label: "Hosting", data: d2 },
				 { label: "Services", data: d3 }
				 ], {
				 hoverable: true,
				 shadowSize: 0,
				 series: {
				 lines: { show: true },
				 points: { show: true }
					},
						xaxis: {
					tickLength: 0
					},
				 yaxis: {
				 ticks: 10,
				 min: -2,
				 max: 2,
				 tickDecimals: 3
				 },
				 grid: {
				 backgroundColor: { colors: [ "#fff", "#fff" ] },
				 borderWidth: 1,
				 borderColor:'#555'
				 }
				 });
 }
/////stack stats/////////


}, function errorCallback(response) {
//console.log(response);
console.log('resData');

});
});