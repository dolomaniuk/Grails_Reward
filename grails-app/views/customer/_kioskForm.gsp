<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <asset:image src="banner.png"></asset:image>
        </div>
    </div>

    <div class="row"> <!-- Begin Nested Rows -->
        <div class="col-sm-5 col-sm-offset-1">
            <h4>${welcomeMessage}</h4>
        </div>
        <div class="col-sm-6"> <!-- Begin Right Column -->
            <g:textField name="phone" class="form-control" placeholder="Enter Your cell number to check in" value="${customer?.phone}" />
            <div class="row"> <!-- First Button Row Spacer -->
                <p/>
            </div>
            <div class="row"> <!-- First Button Row -->
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="1" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="2" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="3" onclick="padkey(this.value)"/>
                </div>
            </div>

            <div class="row"> <!-- Second Button Row Spacer -->
                <p/>
            </div>
            <div class="row"> <!-- Second Button Row -->
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="4" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="5" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="6" onclick="padkey(this.value)"/>
                </div>
            </div>

            <div class="row"> <!-- Third Button Row Spacer -->
                </p>
            </div>
            <div class="row"> <!-- Third Button Row -->
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="7" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="8" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="9" onclick="padkey(this.value)"/>
                </div>
            </div>

            <div class="row"> <!-- Fourth Button Row Spacer -->
                </p>
            </div>
            <div class="row"> <!-- Fourth Button Row -->
                <div class="col-sm-4">
                <g:link class="btn btn-danger btn-lg btn-block" action="checkin">Del</g:link>
                </div>
                <div class="col-sm-4">
                    <input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="0" onclick="padkey(this.value)"/>
                </div>
                <div class="col-sm-4">
                    <g:submitButton class="btn btn-success btn-lg btn-block" name="pad" value="Go" />
                </div>
            </div>
        </div>
    </div> <!-- End Nested Rows -->
</div> <!-- End Container -->

<!-- pad button script -->
<script> function padkey(num) {
    var txt=document.getElementById("phone").value;
    txt=txt + num;
    document.getElementById("phone").value=txt;
}
</script>