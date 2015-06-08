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
    //$scope.types = [
    //    {name: 'Americano', family: 'Coffee'},
    //    {name: 'Latte', family: 'Coffee'},
    //    {name: 'Tea', family: 'that other drink'},
    //    {name: 'Cappuccino', family: 'Coffee'}
    //];


    $scope.channels = [

        {
            name: 'Sean Connery',
            nineAm: 'Goldfinger',
            tenAm: 'Goldfinger',
            elevenAm: 'No programmes available',
            twelvePm: 'Moonraker',
            onePm: 'Moonraker',
            twoPm: 'No programmes available',
            threePm: 'Dr. No'
        },
        {
            name: 'George Lazenby',
            nineAm: 'No programmes available',
            tenAm: 'Skyfall',
            elevenAm: 'Skyfall',
            twelvePm: 'No programmes available',
            onePm: 'No programmes available',
            twoPm: 'Licence to Kill',
            threePm: 'Licence to Kill'
        },
        {
            name: 'Roger Moore',
            nineAm: 'Thunderball',
            tenAm: 'Thunderball',
            elevenAm: 'No programmes available',
            twelvePm: 'Die Another Day',
            onePm: 'Die Another Day',
            twoPm: 'No programmes available',
            threePm: 'No programmes available'
        },
        {
            name: 'Timothy Dalton',
            nineAm: "On Her Majesty's Secret Service",
            tenAm: "On Her Majesty's Secret Service",
            elevenAm: "No programmes available",
            twelvePm: "No programmes available",
            onePm: 'Casino Royal',
            twoPm: 'Casino Royal',
            threePm: 'Casino Royal'

        },
        {
            name: 'Pierce Brosnan',
            nineAm: 'No programmes available',
            tenAm: 'No programmes available',
            elevenAm: 'No programmes available',
            twelvePm: 'A View to Kill',
            onePm: 'A View to Kill',
            twoPm: 'No programmes available',
            threePm: 'No programmes available'
        },
        {
            name: 'Daniel Craig',
            nineAm: 'Quantum of Solace',
            tenAm: 'Quantum of Solace',
            elevenAm: 'No programmes available',
            twelvePm: 'No programmes available',
            onePm: 'You Only Live Twice',
            twoPm: 'You Only Live Twice',
            threePm: 'No programmes available'
        }

    ]


    //
    //$http.get('application/coffeeshop/nearest/Finchley')
    //    .success(function (response) {
    //        $scope.coffeeshops = response.coffeeshops;
    //    });

    //$scope.sizes = ['Small', 'Medium', 'Large'];
    //$scope.messages = [];
    //$scope.regions = ['Finchley', 'Islington', 'Barnet', 'Croydon'];

    //$scope.giveMeCoffee = function () {
    //    CoffeeOrder.save({id: 1}, $scope.drink, function (order) {
    //            $scope.messages.push({type: 'success', msg: 'Order sent!'})
    //        }
    //    )
    //}

    $scope.closeAlert = function (index) {
        $scope.messages.splice(index, 1);
    };

});