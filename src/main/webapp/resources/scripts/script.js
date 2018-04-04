var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $location, $http) {
    $scope.username = "";
    $scope.password = "";
    $scope.submit = function () {
        window.location.href = "/header";
    }

    $scope.gallerylist = {};

    $scope.fetchTrainsList = function () {
        $http.get('gallery/items.json').success(function (galleryList) {
            $scope.gallerylist = galleryList;
        });
    };

    $scope.fetchTrainsList();
});
		