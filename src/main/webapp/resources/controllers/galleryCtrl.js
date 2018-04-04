//var app = angular.module("myApp", ["ngRoute"]);

myApp.controller("galleryCtrl", function ($scope, $http) {

    console.log("From Gallery AK")
    $scope.gallerylist = {};
    $scope.editMode = false;

    $scope.fetchTrainsList = function () {
        $http.get('gallery/items.json').success(function (galleryList) {
            $scope.gallerylist = galleryList;
        });
    };

    $scope.fetchTrainsList();
});