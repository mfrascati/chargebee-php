<?php

namespace ChargeBee\ChargeBee\Models;

use ChargeBee\ChargeBee\Model;

class QuoteLineGroupTax extends Model
{
  protected $allowed = array(
      'name',
      'amount',
      'description'
  );

}