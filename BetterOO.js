
        var sq = new Square(3);
        sq.side = 3;
        var area = sq.area;

        var sq2 = new Square(3);
        sq2.side = 3;
        console.log(sq2.area);

function Square(side){
    console.log
    this.side = side;
    this.area = this.side * this.side;
}
