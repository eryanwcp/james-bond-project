/**
 * Created by Serkan.Tugrul on 05/06/2015.
 */
var jamesBondApp = angular.module('jamesBondApp', ['ngResource', 'ui.bootstrap']);

jamesBondApp.factory("GetChannels", function($resource) {
    return $resource("/application/schedule/channels");
});

jamesBondApp.controller('MovieController', function ($scope, GetChannels) {
        GetChannels.query(function (data) {
            $scope.channels = data;
        });
});