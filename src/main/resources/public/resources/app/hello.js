var myApp = angular.module('app', []);

myApp.controller('HelloController', function ($scope, $http) {
    //http://rest-service.guides.spring.io/greeting
    $http.get('/checkService').
        success(function (data) {
            $scope.greeting = data;
        });
});
