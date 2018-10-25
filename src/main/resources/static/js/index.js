(function ($) {
    var page = 2;
    var template =
        "<li onclick='javascript:detail(\"{{uuid}}\")'>" +
        "<img src='product/{{img}}' width=\"200\" height=\"200\">" +
        "<div class=\"post-info\">" +
        "<div class=\"post-basic-info\">" +
        "<h3><a href=href=\"javascript:;\">{{name}}</a></h3>" +
        "<span><a href=href=\"javascript:;\"><label> </label>{{price}}</a></span>" +
        "<p>{{title}}</p>" +
        "</div></div> </div> </li>";

    var $tiles = $('#tiles'),
        $handler = $('li', $tiles),
        $main = $('#main'),
        $window = $(window),
        $document = $(document),
        options = {
            autoResize: true, // This will auto-update the layout when the browser window is resized.
            container: $main, // Optional, used for some extra CSS styling
            offset: 20, // Optional, the distance between grid items
            itemWidth: 280 // Optional, the width of a grid item
        };


    function load() {
        var index = layer.load(1, {
            shade: [0.1,'#fff'] //0.1透明度的白色背景
        });
        $.ajax({
            url: "commodity/list",
            data:{pageNum:page},
            async:false,
            success: function (data) {
                render(data.datas);
                layer.close(index);
                page++;
            },
            error:function(){
                layer.close(index);
            }
        });
    }

    function render(datas) {
        if (datas) {
            var html = "";
            $.each(datas, function (i, v) {
                var temp = template.replace("{{uuid}}", v.uuid).replace("{{name}}", v.name).replace("{{img}}", v.img).replace("{{price}}", v.price).replace("{{title}}", v.title);
                html += temp;
            });

            $tiles.append(html);
        }else{
            layer.msg('冒的了');
        }
    }

    /**
     * Reinitializes the wookmark handler after all images have loaded
     */
    function applyLayout() {
        $tiles.imagesLoaded(function () {
            // Destroy the old handler
            if ($handler.wookmarkInstance) {
                $handler.wookmarkInstance.clear();
            }

            // Create a new layout handler.
            $handler = $('li', $tiles);
            $handler.wookmark(options);
        });
    }

    /**
     * When scrolled all the way to the bottom, add more tiles
     */
    function onScroll() {
        // Check if we're within 100 pixels of the bottom edge of the broser window.
        var winHeight = window.innerHeight ? window.innerHeight : $window.height(), // iphone fix
            closeToBottom = ($window.scrollTop() + winHeight > $document.height() - 50);

        if (closeToBottom) {
            // Get the first then items from the grid, clone them, and add them to the bottom of the grid
            load();
            applyLayout();
        }
    };

    // Call the layout function for the first time
    applyLayout();

    // Capture scroll event.
    $window.bind('scroll.wookmark', onScroll);
})(jQuery);
