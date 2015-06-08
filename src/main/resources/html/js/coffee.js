/**
 * Created by Serkan.Tugrul on 05/06/2015.
 */
var coffeeApp = angular.module('coffeeApp', ['ngResource', 'ui.bootstrap']);

coffeeApp.factory('CoffeeOrder', function ($resource) {
    return $resource('/coffeeshop/:id/order/',
        {id: '@coffeeShopId'}, {}
    );
});


coffeeApp.controller('OrderController', function ($scope, CoffeeOrder, $http) {
    $scope.types = [
        {name: 'Americano', family: 'Coffee'},
        {name: 'Latte', family: 'Coffee'},
        {name: 'Tea', family: 'that other drink'},
        {name: 'Cappuccino', family: 'Coffee'}
    ];

    $scope.channels = [
        {name: 'Sean Connery', programme: 'Dr. No'},
        {name: 'George Lazenby', programme: 'Goldfinger'},
        {name: 'Timothy Dalton', programme: 'Moonraker'}
    ];

    $http.get('application/coffeeshop/nearest/Finchley')
        .success(function(response) {$scope.coffeeshops = response.coffeeshops;});

    $scope.sizes = ['Small', 'Medium', 'Large'];
    $scope.messages = [];
    $scope.regions = ['Finchley', 'Islington', 'Barnet', 'Croydon'];

    $scope.giveMeCoffee = function () {
        CoffeeOrder.save({id: 1}, $scope.drink, function (order) {
                $scope.messages.push({type: 'success', msg: 'Order sent!'})
            }
        )
    }

    $scope.closeAlert = function (index) {
        $scope.messages.splice(index, 1);
    };

});