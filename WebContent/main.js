// 画像の表示座標
var x = 0;
var pv = 0; // 1回の移動量

// キーボードのフラグ
var left = 0;
var right = 0;

// イメージ変換用
var count = 0;
var isLeft = false;
var keyCode = 39;

// イベント検出
document.onkeydown = keyDown;
document.onkeyup = keyUp;

// キーボード入力イベント
function keyDown(event) {
	// 方向転換
	if(keyCode != event.keyCode) {
		keyCode = event.keyCode;
		count = 0;
		if (keyCode == 37) {
			left = 1;
			isLeft = true;
		}
		if (keyCode == 39) {
			right = 1;
			isLeft = false;
		}
	} else {
		// 同じ方向
		if (keyCode == 37) {
			left = 1;
			isLeft = true;
		}
		if (keyCode == 39) {
			right = 1;
			isLeft = false;
		}
		count++;
	}
	console.log(count);
	changeImg();
	disp();
}

//キーボードが離されたイベント
function keyUp(event) {
	if (event.keyCode == 37) left = 0;
	if (event.keyCode == 39) right = 0;
}

// イメージを変更する
function changeImg() {
	var img = document.getElementById("img_mario");
	if (!isLeft) {
		switch (count % 3) {
		case 0:
			img.src = "images/mario_1.png";
			break;
		case 1:
			img.src = "images/mario_2.png";
			break;
		case 2:
			img.src = "images/mario_3.png";
			break;
		default:
			break;	
		}	
	} else {
		switch (count % 3) {
		case 0:
			img.src = "images/mario_4.png";
			break;
		case 1:
			img.src = "images/mario_5.png";
			break;
		case 2:
			img.src = "images/mario_6.png";
			break;
		default:
			break;	
		}
	}
}

// 表示座標を更新する
function disp() {
	if (count < 10) {
		pv = 5;
	} else if (count >= 10 && count <30) {
		pv = 10;
	} else if (count >= 30) {
		pv = 20;
	}
	var img = document.getElementById("mario");
	var elm = document.getElementById("back");

	// 現在位置
	var imgWidth = img.offsetWidth;
	var imgLeft = img.offsetLeft;

	// 移動範囲
	var elmWidth = elm.offsetWidth;

	if (left == 1) {
		if (imgLeft > 0) {
			x = x - pv;
			img.style.left = x + "px";
		} else {
			return;
		}
	}
	if (right == 1) {
		if (imgLeft + imgWidth  < elmWidth) {
			x = x + pv;
			img.style.left = x + "px";
		} else {
			return;
		}	
	}
}


