function InlineEditorController($scope){

	// $scope – специальный объект, который задает параметры отображения 
	// переменной. Здесь вы можете задать некоторые значения по умолчанию	
	$scope.showtooltip = false;
	$scope.value = 'Edit me.';

	// Некоторые вспомогательные функции, которые доступны после инициации	// Аngular.

	$scope.hideTooltip = function(){

		// Когда значение модели меняется, AngularJS автоматически вносит		// изменения в формат вывода. И всплывающее меню скрывается с экрана.


		$scope.showtooltip = false;
	}

	$scope.toggleTooltip = function(e){
		e.stopPropagation();
		$scope.showtooltip = !$scope.showtooltip;
	}
}